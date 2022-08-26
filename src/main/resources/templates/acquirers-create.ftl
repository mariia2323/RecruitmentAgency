<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Acquirer creation</title>
    <#include "css/Style.css">

</head>
<header>
    <a href="/ui/v1/acquirers/"><ion-icon name="arrow-undo-sharp"></ion-icon></a>
</header>
<body>
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

            <input class="submitBtn" type="submit" value="Create"/>
        </form>
    </fieldset>
</div>
<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>
</html>