<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Agreement</title>
    <#include "css/Style.css">
    <link rel="stylesheet" href="css/icofont/icofont.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<#--    <style>-->
<#--        .table-center {-->
<#--            display: flex;-->
<#--            place-content: center;-->
<#--        }-->
<#--    </style>-->
<#--    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">-->
</head>
    <header>
        <a href="/mainMenu.html"><ion-icon name="arrow-undo-sharp"></ion-icon></a>
    </header>
    <body style="background-color: #FFFDFB;">
        <div class="titleMain">
            <h1>Agreements</h1>
        </div>
    <div class="table-center mt-4"">
        <div class="table-center">
            <table class="table table-bordered w-auto">
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
                    <td class="text-truncate" style="max-width: 50px" data-toggle="tooltip" data-placement="top" title=${agreement.id}>${agreement.id}</td>
                    <td>${agreement.name}</td>
                    <td>${agreement.description}</td>
                    <td>${agreement.employer?if_exists}</td>
                    <td>${agreement.acquirer?if_exists}</td>
                    <td>${agreement.offer?if_exists}</td>
                    <td>${agreement.commission}</td>
                    <td>${agreement.the_date}</td>
                    <td>${agreement.education?if_exists}</td>
                    <td>${agreement.createdAt}</td>
                    <td>${agreement.updatedAt?if_exists}</td>
                    <td><a href="/ui/v1/agreements/del/${agreement.id}"><button type="button" class="btn btn-outline-danger">Del</button></a></td>
                    <td><a href="/ui/v1/agreements/edit/${acqagreemen.id}"><button type="button" class="btn btn-outline-warning">Edit</button></a></td>
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
        <a href="/ui/v1/agreements/add"><button type="button" class="btn btn-outline-success mt-3" id="createBtn">Add Item</button></a>
    </body>
</html>