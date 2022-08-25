<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Offers</title>
    <style>
        .table-center {
            display: flex;
            place-content: center;
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>

<h1>Hello, offers! </h1>
<div class="table-center">
    <div class="table-center" style="width: 80%; display: flex; align-content: center">
        <table class="table table-dark table-striped">
            <thead>
            <th> ID </th>
            <th> Name</th>
            <th> Description</th>
            <th> workType</th>
            <th> jobTitle</th>
            <th> workExperience</th>
            <th> rate</th>
            <th> projectDescription</th>
            <th> Created At</th>
            <th> Updated At</th>
            <th> DELETE</th>
            <th> EDIT</th>
            </thead>
            <tbody
            <#list offers as offer >
                <tr>
                    <td>${offer.id}</td>
                    <td>${offer.name}</td>
                    <td>${offer.description}</td>
                    <td>${offer.workType}</td>
                    <td>${offer.jobTitle}</td>
                    <td>${offer.workExperience}</td>
                    <td>${offer.rate}</td>
                    <td>${offer.projectDescription}</td>
                    <td>${offer.createdAt}</td>
                    <td>${offer.updatedAt?if_exists}</td>
                    <td><a href="/ui/v1/offer/del/${offer.id}"><button type="button" class="btn btn-danger">Del</button></a></td>
                    <td><a href="/ui/v1/offer/edit/${offer.id}"><button type="button" class="btn btn-info">Edit</button></a></td>
                </tr>
            </#list>
            </tbody>

        </table>
    </div>
</div>

<a href="/ui/v1/offers/add">CREATE</a>
</body>
</html>