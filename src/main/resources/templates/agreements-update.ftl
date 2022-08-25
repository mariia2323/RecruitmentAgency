<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Agreement update</title>
</head>
<body>
<h1>Agreement Update</h1>
<div style="width: 60%; text-align: center">
    <fieldset>
        <legend>Agreement update</legend>
        <form name="agreements" action="" method="POST">
            name:<@spring.formInput "form.name" "" "text"/>
            <br>
            Description:<@spring.formInput "form.description" "" "text"/>
            <br>
            Employer:<@spring.formInput "form.employer" "" "text"/>
            <br>
            acquirer:<@spring.formInput "form.acquirer" "" "text"/>
            <br>
            offer:<@spring.formInput "form.offer" "" "text"/>
            <br>
            commission:<@spring.formInput "form.commission" "" "text"/>
            <br>
            the_date:<@spring.formInput "form.the_date" "" "text"/>
            <br>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>
</body>
</html>