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
                <h1>${modelCar}</h1>
                <ul>
                    <img class="img" src="https://www.cars.com/i/large/in/v2/stock_photos/692de734-d244-4e10-bfea-e2568e1be753/e4da0e25-d04b-4974-8cca-ed9a534c33e4.png">
                    <p>#1</p>
                    <li>Marca do carro: ${brandCar}</li>
                    <li>Cor do carro: ${colorCar}</li>
                    <li>Quantidade de passageiros: ${quantPassengers}</li>
                </ul>
        </div>
    </div>

</body>
</html>