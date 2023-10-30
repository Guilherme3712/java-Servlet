<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List Cars</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <div class="card">
                <h1>${modelBus}</h1>
                <ul>
                    <img class="img" src="http://www.marcopolochina.com/Templates/cn/Torino/2.png">
                    <p>#1</p>
                    <li>Marca do carro: ${brandBus}</li>
                    <li>Cor do carro: ${colorBus}</li>
                    <li>Quantidade de passageiros: ${quantPassengers}</li>
                </ul>
        </div>
    </div>

</body>
</html>