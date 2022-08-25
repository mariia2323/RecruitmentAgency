<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Acquirer creation</title>
    <#include "css/Style.css">
</head>
<body>
<!--<h1>Acquirer Creation</h1>-->
<div style="width: 60%; text-align: center">
  <!--  <fieldset>
        <legend>Acquirer create</legend>
        <form name="acquirers" action="" method="POST">
            name:<@spring.formInput "form.name" "" "text"/>
            <br>
            Description:<@spring.formInput "form.description" "" "text"/>
            <br>
            Surname:<@spring.formInput "form.surname" "" "text"/>
            <br>
            Patronymic:<@spring.formInput "form.patronymic" "" "text"/>
            <br>
            WorkExperience:<@spring.formInput "form.workExperience" "" "text"/>
            <br>
            <br>
            WorkType:<@spring.formInput "form.workType" "" "text"/>
            <br>
            Other_data:<@spring.formInput "form.other_data" "" "text"/>
            <br>
            Date_of_birth:<@spring.formInput "form.date_of_birth" "" "text"/>
            <br>
            Education:<@spring.formInput "form.education" "" "text"/>
            <br>

            <input type="submit" value="Create"/>
        </form>
    </fieldset> -->
</div>
<div class="customFormAdd">
<fieldset>
    <legend>Acquirer Creation</legend>
    <form action="/ui/v1/acquirers/add" method="post">
        <div class="modal-body table-center">
            <p>Name: <input type="text" name="name" class="form-control"/></p>
            <p>Description: <input type="text" name="description" class="form-control"/></p>
            <p>Surname: <input type="text" name="surname" class="form-control"/></p>
            <p>Patronymic: <input type="text" name="patronymic" class="form-control"/></p>
            <p>Work Experience: <input type="text" name="workExperience" class="form-control"/></p>
            <p>Work Type: <input type="text" name="workType" class="form-control"/></p>
            <p>Other data: <input type="text" name="other_data" class="form-control"/></p>
            <p>Date of birth: <input type="text" name="date_of_birth" class="form-control"/></p>
            <p>Education: <input type="text" name="education" class="form-control"/></p>
        </div>
        <div class="modal-footer">
            <input type="submit" value="Submit" class="btn btn-outline-success btn-lg"/>
            <input type="reset" class="btn btn-outline-warning btn-lg" value="Clear" />
        </div>
    </form>
</fieldset>
</div>
</body>
</html>