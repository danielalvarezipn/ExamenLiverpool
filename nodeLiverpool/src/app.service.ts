import { Injectable } from '@nestjs/common';
import axios from "axios";

@Injectable()
export class AppService {
  getHealthChecks(): string {
    return 'Run well';
  }

  async dataFromSpring(param: string): Promise<any> {
    const url = `http://localhost:8080/consulta?folio=${param}`;
    const response = await axios.get(url);
    return response.data;
  }
}
