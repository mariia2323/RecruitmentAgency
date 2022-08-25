<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Agreement</title>
    <style>
        .table-center {
            display: flex;
            place-content: center;
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>

<h1>Hello, Agreement! </h1>
<div class="table-center">
    <div class="table-center" style="width: 80%; display: flex; align-content: center">
        <table class="table table-secondary table-striped">
            <thead>
            <th> ID </th>
            <th> Name</th>
            <th> Description</th>
            <th> employer</th>
            <th> acquirer</th>
            <th> offer</th>
            <th> commission</th>
            <th> the_date</th>
            <th> Created At</th>
            <th> Updated At</th>
            <th> DELETE</th>
            <th> EDIT</th>
            </thead>

            <tbody
            <#list agreements as agreement >
                <tr>
                    <td>${agreement.id}</td>
                    <td>${agreement.name}</td>
                    <td>${agreement.description}</td>
                    <td>${agreement.employer}</td>
                    <td>${agreement.acquirer}</td>
                    <td>${agreement.offer}</td>
                    <td>${agreement.commission}</td>
                    <td>${agreement.the_date}</td>
                    <td>${agreement.education}</td>
                    <td>${agreement.createdAt}</td>
                    <td>${acquirer.updatedAt?if_exists}</td>
                    <td><a href="/ui/v1/agreements/del/${agreement.id}"><button type="button" class="btn btn-danger">Del</button></a></td>
                    <td><a href="/ui/v1/agreements/edit/${agreement.id}"><button type="button" class="btn btn-info">Edit</button></a></td>
                </tr>
            </#list>
            </tbody>


        </table>
    </div>
</div>

<a href="/ui/v1/agreements/add">CREATE</a>
</body>
</html>