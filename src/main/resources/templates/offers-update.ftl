<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Offer creation</title>
    <#include "css/Style.css">
</head>
<header>
    <a href="/ui/v1/offers/"><ion-icon name="arrow-undo-sharp"></ion-icon></a>
</header>
<body style="background-color: #FFFDFB">
<div class="table-center customTable">
    <fieldset class="customFieldset">
        <legend>Offer update</legend>
        <form name="offers" action="" method="POST" class="customForm" >
            name:<@spring.formInput "form.name" "" "text"/>
            <br>
            Description:<@spring.formInput "form.description" "" "text"/>
            <br>
            workType:<@spring.formInput "form.workType" "" "text"/>
            <br>
            jobTitle:<@spring.formInput "form.jobTitle" "" "text"/>
            <br>
            workExperience:<@spring.formInput "form.workExperience" "" "text"/>
            <br>
            rate:<@spring.formInput "form.rate" "" "text"/>
            <br>
            projectDescription:<@spring.formInput "form.projectDescription" "" "text"/>
            <br>

            <input class="submitBtn" type="submit" value="Update"></input>
        </form>
    </fieldset>
</div>
<a href="/ui/v1/offers/"><button type="button" class="btn btn-dark">Back</button></a>
<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>
</html>