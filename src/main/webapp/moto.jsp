<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List Motocycles</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <div class="card">
                <h1>${modelMoto}</h1>
                <ul>
                    <img class="img" src="https://www.honda.com.br/motos/sites/hda/files/2022-04/2006-cg150-special-edition.webp">
                    <p>#1</p>
                    <li>Marca da Moto: ${brandMoto}</li>
                    <li>Cor da Moto: ${colorMoto}</li>
                    <li>Cilindradas da Moto: ${ccMoto}cc</li>
                </ul>
        </div>
        <div class="card">
                <h1>${modelMoto1}</h1>
                <ul>
                    <img class="img" src="https://motos2023.com.br/wp-content/uploads/2022/12/Mat_Marvel_Blue_Metallic1.png">
                    <p>#2</p>
                    <li>Marca da Moto: ${brandMoto1}</li>
                    <li>Cor da Moto: ${colorMoto1}</li>
                    <li>Cilindradas da Moto: ${ccMoto1}cc</li>
                </ul>
        </div>
        <div class="card">
                <h1>${modelMoto2}</h1>
                <ul>
                    <img class="img" src="https://www.yamaha-motor.com.br/ccstore/v1/images/?source=/file/v3842131394259741621/products/30085.300851.png&height=300&width=300">
                    <p>#3</p>
                    <li>Marca da Moto: ${brandMoto2}</li>
                    <li>Cor da Moto: ${colorMoto2}</li>
                    <li>Cilindradas da Moto: ${ccMoto2}cc</li>
                </ul>
        </div>

    </div>

</body>
</html>