<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Acquirers</title>
    <#include "css/Style.css">
    <link rel="stylesheet" href="css/icofont/icofont.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<header>
    <a href="/mainMenu.html"><ion-icon name="arrow-undo-sharp"></ion-icon></a>
</header>
<body style="background-color: #FFFDFB;">


<div class="titleMain">
    <h1>Acquirers </h1>
</div>
<div class="table-center mt-4">

    <div class="table-center">

        <table class="table table-bordered w-auto">


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
                    <td><a href="/ui/v1/acquirers/del/${acquirer.id}"><button type="button" class="btn btn-outline-danger">Del</button></a></td>
                    <td><a href="/ui/v1/acquirers/edit/${acquirer.id}"><button type="button" class="btn btn-outline-warning">Edit</button></a></td>
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
<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
<a href="/ui/v1/acquirers/add"><button type="button" class="btn btn-outline-success mt-3" id="createBtn">Add Item</button></a>
</body>
</html>
