# LABORATORIOS 5 & 6 - CI/CD | React

## Descripción
Este proyecto es el resultado del **Laboratorio 5**, donde se implementó un flujo de **CI/CD** para un sistema de reservas de laboratorios, utilizando **GitHub Actions** para la integración y despliegue continuo en **Azure App Service** junto con la implementación de **React** para manejar la interfaz de usuario y un sistema de autenticación para que los usuarios gestionen sus reservas.

## Implementaciones Realizadas

### 1. Configuración de CI/CD con GitHub Actions
Se creó un **workflow** en GitHub Actions con tres **jobs**:
- **build**: Ejecuta la fase de compilación (`mvn compile`).
- **test**: Ejecuta pruebas unitarias y de integración (`mvn verify`).
- **deploy**: Despliega el backend en **Azure App Service**.

Este workflow se activa con cada `pull_request` al repositorio. <br><br>

![Screenshot 2025-04-03 062937](https://github.com/user-attachments/assets/b600062f-858d-475f-872c-55c592733afd)


### 2. Pruebas Implementadas
Se agregaron pruebas automatizadas para validar el comportamiento del sistema de reservas:
- **Consulta de reservas registradas**.
- **Validación de reservas inexistentes**.
- **Creación de reservas**.
- **Eliminación y consulta de reservas eliminadas**.

### 3. Despliegue en Azure
Se configuró el despliegue en **Azure App Service** mediante GitHub Actions, utilizando la acción `azure/webapps-deploy@v2`. Se resolvieron problemas con el puerto de despliegue y la conexión a la base de datos.

### 4. Integración de Base de Datos
Inicialmente, la aplicación no funcionaba debido a la falta de una base de datos. Se creó una instancia de **MySQL en Azure** con facturación de 0 dólares y se configuraron las credenciales en **application.properties**.

### 5. Generación de Datos y Análisis
Se agregaron nuevas funcionalidades para la generación de datos y su análisis:
- Se incorporó un campo **prioridad de la reserva (1 a 5)**.
- Se generaron entre **100 y 1000 reservas aleatorias**.
- Se implementó una API para obtener estos datos y analizarlos.

### 6. Seguridad y Autenticación
Se añadió un sistema de **autenticación de usuarios**, permitiendo que cada usuario gestione sus reservas. Se implementaron las siguientes medidas de seguridad:
- Autenticación mediante **JWT**.
- Restricción de accesos a los endpoints del backend.
- Validación de usuarios y permisos.

## Resultado Final
✅ **CI/CD funcional con GitHub Actions**
✅ **Despliegue exitoso en Azure**
✅ **Pruebas automatizadas implementadas**
✅ **Base de datos configurada correctamente**
✅ **Generación de datos y análisis implementado**
✅ **Autenticación de usuarios integrada**

---
🚀 **Proyecto finalizado y desplegado en Azure con éxito!** 🎉
