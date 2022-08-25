<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Offer creation</title>
</head>
<body>
<h1>Offer Creation</h1>
<div style="width: 60%; text-align: center">
    <fieldset>
        <legend>Offer create</legend>
        <form name="offers" action="" method="POST">
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
            name:<@spring.formInput "form.name" "" "text"/>
            <br>
            <input type="submit" value="Create"/>

        </form>
    </fieldset>
</div>
</body>

</html>