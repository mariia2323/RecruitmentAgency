<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Acquirer update</title>
    <#include "css/Style.css">
</head>
<header>
    <a href="/ui/v1/acquirers/"><ion-icon name="arrow-undo-sharp"></ion-icon></a>
</header>
<body style="background-color: #FFFDFB">
<div class="table-center customTable">
    <fieldset class="customFieldset">
        <legend>Acquirer update</legend>
        <form name="acquirers" action="" method="POST" class="customForm" >
            Name:<@spring.formInput "form.name" "" "text"/>
            <br>
            Description:<@spring.formInput "form.description" "" "text"/>
            <br>
            Surname:<@spring.formInput "form.surname" "" "text"/>
            <br>
            Patronymic:<@spring.formInput "form.patronymic" "" "text"/>
            <br>
            Work Experience:<@spring.formInput "form.workExperience" "" "text"/>
            <br>
            Work Type:<@spring.formInput "form.workType" "" "text"/>
            <br>
            Other data:<@spring.formInput "form.other_data" "" "text"/>
            <br>
            Date of birth:<@spring.formInput "form.date_of_birth" "" "text"/>
            <br>
            Education:<@spring.formInput "form.education" "" "text"/>
            <br>

            <input class="submitBtn" type="submit" value="Update"></input>
        </form>
    </fieldset>
</div>
<a href="/ui/v1/acquirers/"><button type="button" class="btn btn-dark">Back</button></a>
<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>
</html>




<#--<fieldset>-->
<#--    <form action="/ui/v1/acquirers/add" method="post">-->
<#--        <div class="modal-body">-->
<#--            <p>Name: <input type="text" name="name" class="form-control"/></p>-->
<#--            <p>Description: <input type="text" name="description" class="form-control"/></p>-->
<#--            <p>Surname: <input type="text" name="surname" class="form-control"/></p>-->
<#--            <p>Patronymic: <input type="text" name="patronymic" class="form-control"/></p>-->
<#--            <p>WorkExperience: <input type="text" name="workExperience" class="form-control"/></p>-->
<#--            <p>WorkType: <input type="text" name="workType" class="form-control"/></p>-->
<#--            <p>Other_data: <input type="text" name="other_data" class="form-control"/></p>-->
<#--            <p>Date_of_birth: <input type="text" name="date_of_birth" class="form-control"/></p>-->
<#--            <p>Education: <input type="text" name="education" class="form-control"/></p>-->
<#--        </div>-->
<#--        <div class="modal-footer">-->
<#--            <input type="submit" value="Submit" class="btn btn-outline-success btn-lg"/>-->
<#--            <input type="reset" class="btn btn-outline-warning btn-lg" value="Clear" />-->
<#--        </div>-->
<#--    </form>-->
<#--</fieldset>-->