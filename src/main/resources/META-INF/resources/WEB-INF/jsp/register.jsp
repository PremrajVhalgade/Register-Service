<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h1>Welcome, Enter Details to register</h1>
        <form:form method="POST" action="/addSignup" modelAttribute="user">
             <table>
                <tr>
                    <td><form:label path="firstName">First Name</form:label></td>
                    <td><form:input path="firstName"/></td>
                </tr>
                <tr>
                    <td><form:label path="lastName">Last Name</form:label></td>
                    <td><form:input path="lastName"/></td>
                </tr>
                <tr>
                    <td><form:label path="email">Email</form:label></td>
                    <td><form:input path="email"/></td>
                </tr>
                <tr>
                    <td><form:label path="policyNo">Policy No.</form:label></td>
                    <td><form:input path="policyNo"/></td>
                </tr>
                <tr>
                    <td><form:label path="dob">D.O.B</form:label></td>
                    <td><form:input path="dob"/></td>
                </tr>
                <tr>
                    <td><form:label path="country">COUNTRY</form:label></td>
                    <td><form:input path="country"/></td>
                </tr>
                <tr>
                    <td><form:label path="state">STATE</form:label></td>
                    <td><form:input path="state"/></td>
                </tr>
                <tr>
                    <td><form:label path="city">CITY</form:label></td>
                    <td><form:input path="city"/></td>
                </tr>
                
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>