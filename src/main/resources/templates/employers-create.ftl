<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employer creation</title>
    <#include "css/Style.css">

</head>
<header>
    <a href="/ui/v1/employers/"><ion-icon name="arrow-undo-sharp"></ion-icon></a>
</header>
<body>
<div class="table-center customTable">
    <fieldset class="customFieldset">
        <legend>Employer update</legend>
        <form name="employers"  action="" method="POST" class="customForm" >
            Name:<@spring.formInput "form.name" "" "text"/>
            <br>
            Description:<@spring.formInput "form.description" "" "text"/>
            <br>
            Company:<@spring.formInput "form.company" "" "text"/>
            <br>
            Address:<@spring.formInput "form.address" "" "text"/>
            <br>
            Phone number:<@spring.formInput "form.phone_number" "" "text"/>
            <br>

            <input class="submitBtn" type="submit" value="Create"/>
        </form>
    </fieldset>
</div>
<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>
</html>