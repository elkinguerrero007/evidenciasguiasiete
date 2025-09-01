<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registro de Producto</title>
</head>
<body>
    <h2>Registrar Producto</h2>
    <form action="/productos/save" method="post">
        Nombre: <input type="text" name="nombre" required/><br/><br/>
        Precio: <input type="number" step="0.01" name="precio" required/><br/><br/>
        <button type="submit">Guardar</button>
    </form>
    <br/>
    <a href="/productos/lista">Volver a la lista</a>
</body>
</html>
