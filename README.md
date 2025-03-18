# API de Gasolinera 🚀  

## Descripción  
Esta API permite gestionar una gasolinera, incluyendo el manejo de combustibles, precios y ventas. Está desarrollada con **Java Spring Boot**, utilizando **JPA, Hibernate y Lombok** dentro del patrón **Modelo-Vista-Controlador (MVC)**.  

La API está desplegada en Render y se puede acceder en el siguiente enlace:  
🔗 [Gasolinera API](https://gasolinera1-ultimo.onrender.com/)  

## **Endpoints Disponibles**

### **PrecioController** (`/precio`)
- `GET /precio/lista` → Lista todos los precios.
- `GET /precio/buscar/{id}` → Busca un precio por ID.
- `POST /precio/crear` → Crea un nuevo precio.
- `DELETE /precio/borrar/{id}` → Borra un precio por ID.
- `PUT /precio/editar` → Edita un precio existente.

### **ProductoController** (`/producto`)
- `GET /producto/lista` → Lista todos los productos.
- `GET /producto/buscar/{id}` → Busca un producto por ID.
- `POST /producto/crear` → Crea un nuevo producto.
- `DELETE /producto/borrar/{id}` → Borra un producto por ID.
- `PUT /producto/editar` → Edita un producto existente.

### **SuministrosController** (`/suministro`)
- `GET /suministro/lista` → Lista todos los suministros.
- `GET /suministro/buscar/{id}` → Busca un suministro por ID.
- `POST /suministro/crear` → Crea un nuevo suministro.
- `DELETE /suministro/borrar/{id}` → Borra un suministro por ID.
- `PUT /suministro/editar` → Edita un suministro existente.

### **SurtidorController** (`/surtidor`)
- `GET /surtidor/lista` → Lista todos los surtidores.
- `GET /surtidor/buscar/{id}` → Busca un surtidor por ID.
- `POST /surtidor/crear` → Crea un nuevo surtidor.
- `DELETE /surtidor/borrar/{id}` → Borra un surtidor por ID.
- `PUT /surtidor/editar` → Edita un surtidor existente.

### **SurtidorProductoController** (`/surtprod`)
- `GET /surtprod/lista` → Lista todos los productos de surtidor.
- `GET /surtprod/buscar/{id}` → Busca un producto de surtidor por ID.
- `POST /surtprod/crear` → Agrega un producto a un surtidor.
- `DELETE /surtprod/eliminar/{id}` → Elimina un producto de surtidor por ID.
- `PUT /surtprod/editar` → Edita un producto de surtidor.

### **TanqueController** (`/tanque`)
- `GET /tanque/lista` → Lista todos los tanques.
- `GET /tanque/buscar/{id}` → Busca un tanque por ID.
- `POST /tanque/crear` → Crea un nuevo tanque.
- `DELETE /tanque/borrar/{id}` → Borra un tanque por ID.
- `PUT /tanque/editar` → Edita un tanque existente.

## **Tecnologías Utilizadas**
- **Spring Boot**
- **JPA / Hibernate**
- **Lombok**
- **Render** (para despliegue)


