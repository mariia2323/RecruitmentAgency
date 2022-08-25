<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employers</title>
    <style>
        .table-center {
            display: flex;
            place-content: center;
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>

<h1>Hello, Employers! </h1>
<div class="table-center">
    <div class="table-center" style="width: 80%; display: flex; align-content: center">
        <table class="table table-success table-striped">
            <thead>
            <th> ID </th>
            <th> Name</th>
            <th> Description</th>
            <th> company</th>
            <th> address</th>
            <th> phone_number</th>
            <th> Created At</th>
            <th> Updated At</th>
            <th> DELETE</th>
            <th> EDIT</th>
            </thead>
            <tbody
            <#list employers as employer >
                <tr>
                    <td>${employer.id}</td>
                    <td>${employer.name}</td>
                    <td>${employer.description}</td>
                    <td>${employer.company}</td>
                    <td>${employer.address}</td>
                    <td>${employer.phone_number}</td>
                    <td>${employer.createdAt}</td>
                    <td>${employer.updatedAt?if_exists}</td>
                    <td><a href="/ui/v1/employers/del/${employer.id}"><button type="button" class="btn btn-danger">Del</button></a></td>
                    <td><a href="/ui/v1/employers/edit/${employer.id}"><button type="button" class="btn btn-info">Edit</button></a></td>
                </tr>
            </#list>
            </tbody>

        </table>
    </div>
</div>

<a href="/ui/v1/employers/add">CREATE</a>
</body>
</html>