import { Body, Controller, Get, Post } from "@nestjs/common";
import { AppService } from './app.service';

@Controller()
export class AppController {
  constructor(private readonly appService: AppService) {}

  @Get()
  getHealthChecks(): string {
    return this.appService.getHealthChecks();
  }

  @Post('data')
  async fetchData(@Body() body: { folio: string }): Promise<any> {
    const { folio } = body;
    const data = await this.appService.dataFromSpring(folio);
    return data;
  }
}
