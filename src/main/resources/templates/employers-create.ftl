<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employer creation</title>
</head>
<body>
<h1>Employer Creation</h1>
<div style="width: 60%; text-align: center">
    <fieldset>
        <legend>Employer create</legend>
        <form name="employers" action="" method="POST">
            name:<@spring.formInput "form.name" "" "text"/>
            <br>
            Description:<@spring.formInput "form.description" "" "text"/>
            <br>
            company:<@spring.formInput "form.company" "" "text"/>
            <br>
            address:<@spring.formInput "form.address" "" "text"/>
            <br>
            phone_number:<@spring.formInput "form.phone_number" "" "text"/>
            <br>
            <input type="submit" value="Create"/>

        </form>
    </fieldset>
</div>
</body>
</html>