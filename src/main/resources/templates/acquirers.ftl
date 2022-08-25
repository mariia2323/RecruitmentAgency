
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Acquirers</title>
    <#include "css/Style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>


<div class="titleMain"; background-color: #A0E7E5>
    <h1>Hello, Acquirers! </h1>
</div>
<div class="table-center customTable">

    <div class="table-center">

        <table class="table table-primary table-striped w-auto">


            <thead>
            <th> ID </th>
            <th> Name</th>
            <th> Description</th>
            <th> Surname</th>
            <th> Patronymic</th>
            <th> Work Experience</th>
            <th> Work Type</th>
            <th> Other data</th>
            <th> Date of birth</th>
            <th> Education</th>
            <th> Created At</th>
            <th> Updated At</th>
            <th> DELETE</th>
            <th> EDIT</th>


            </thead>
            <tbody
            <#list acquirers as acquirer >
                <tr>
                    <td class="text-truncate" style="max-width: 50px" data-toggle="tooltip" data-placement="top" title=${acquirer.id}>${acquirer.id}</td>
                    <td>${acquirer.name}</td>
                    <td>${acquirer.description}</td>
                    <td>${acquirer.surname}</td>
                    <td>${acquirer.patronymic}</td>
                    <td>${acquirer.workExperience?if_exists}</td>
                    <td>${acquirer.workType?if_exists}</td>
                    <td>${acquirer.other_data}</td>
                    <td>${acquirer.date_of_birth}</td>
                    <td>${acquirer.education?if_exists}</td>
                    <td>${acquirer.createdAt}</td>
                    <td>${acquirer.updatedAt?if_exists}</td>
                    <td><a href="/ui/v1/acquirers/del/${acquirer.id}"><button type="button" class="btn btn-danger">Del</button></a></td>
                    <td><a href="/ui/v1/acquirers/edit/${acquirer.id}"><button type="button" class="btn btn-info">Edit</button></a></td>
                </tr>
            </#list>
            </tbody>


        </table>
    </div>
</div>
<script>
    $(function () {
        $('[data-toggle="tooltip"]').tooltip()
    })
</script>
<a href="/ui/v1/acquirers/add">CREATE</a>
</body>
</html>
