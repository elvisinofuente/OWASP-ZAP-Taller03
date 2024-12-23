1) abrir ZAP
2) configurar el puerto    -------> selenium
    - navegador > proxy
    - manual explore >---> abre navegador ya configurado
3) flujo de negocio (smoke test / e2e / sanity test / otro) ---> selenium
4) revisar sitios >revisar que ya esta grabado el hostname / ip ---> API ZAP - API Client
5) seleccionamos > iniciar escaneo---> API ZAP - API Client
6) monitorear hasta que el escaneo este a un 100% ---> API ZAP - API Client
7) generar el reporte OWASP ZAP ---> API ZAP - API Client
8) obtener la lista de vulnerabilidades que se realizo ---> API ZAP - API Client
9) obtener la lista de alertas/ vulnerabilidades encontradas ---> API ZAP - API Client
10) generar otro reporte flujo negocio + reporte OWASP ZAP ---> Allure