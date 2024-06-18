import React, { useState } from 'react';
import axios from 'axios';

const DataComponent = () => {
    const [folio, setFolio] = useState('');
    const [data, setData] = useState(null);

    const fetchData = async () => {
        try {
            // Ajusta la URL según donde esté tu servidor API
            const response = await axios.post('http://localhost:3000/data', { folio });
            setData(response.data);
        } catch (error) {
            console.error('Error fetching data:', error);
        }
    };

    const handleInputChange = (e) => {
        setFolio(e.target.value);
    };

    return (
        <div>
            <h2>Data Component</h2>
            <div>
                <label htmlFor="folioInput">Folio:</label>
                <input
                    type="text"
                    id="folioInput"
                    value={folio}
                    onChange={handleInputChange}
                    placeholder="Ingrese el folio"
                />
                <button onClick={fetchData}>Fetch Data</button>
            </div>
            {data && (
                <div>
                    <h3>Respuesta del Servidor:</h3>
                    <pre>{JSON.stringify(data, null, 2)}</pre>
                </div>
            )}
        </div>
    );
};

export default DataComponent;
