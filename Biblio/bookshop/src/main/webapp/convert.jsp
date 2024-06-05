<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
    <h1>Currency Converter</h1>
    <form action="convert" method="post">
        <label for="amount">Amount in USD:</label>
        <input type="number" step="0.01" id="amount" name="amount" required>
        <button type="submit">Convert to EUR</button>
    </form>
    
    <c:if test="${not empty amountInEuro}">
        <h2>Conversion Result</h2>
        <p>${amount} USD is equal to ${amountInEuro} EUR</p>
    </c:if>
</body>
</html>
