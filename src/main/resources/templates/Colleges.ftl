<html>

<head></head>

<body>
    <#if data??>
        <h3>
            <#if data.currentDate??>
                Date Created : ${data.currentDate?date}
            </#if>
        </h3>
        <h2>
            <#if data.title??>
                Title of report : ${data.title}
            </#if>
        </h2>
        <hr />
        <#if data.colleges??>
            <table>
                <#list data.colleges as college>
                    <tr>
                        <td valign="top">College Id : ${college.collegeId?c}</td>
                        <td valign="top"> College Name : ${college.collegeName}</td>
                        <td valign="top">
                            College Address : ${college.collegeAddress.street},
                            ${college.collegeAddress.city}, ${college.collegeAddress.state},
                            ${college.collegeAddress.zip?c}
                        </td>
                        <td>
                            <b>Students :</b><br />
                            <#if college.students??>
                                <table>
                                    <#list college.students as student>
                                        <tr>
                                            <td>Roll Number : </td>
                                            <td>${student.rollNumber?c}</td>
                                        </tr>
                                        <tr>
                                            <td>Name : </td>
                                            <td>${student.studentName}</td>
                                        </tr>
                                        <tr>
                                            <td>Course : </td>
                                            <td>${student.course}</td>
                                        </tr>
                                        <tr>
                                            <td>Is Pass : </td>
                                            <td>${student.isPass?string}</td>
                                        </tr>
                                        <tr>
                                            <td>Student Address : </td>
                                            <td>
                                                ${student.studentAddress.street},
                                                ${student.studentAddress.city},
                                                ${student.studentAddress.state},
                                                ${student.studentAddress.zip?c}
                                            </td>
                                        </tr>
                                    </#list>
                                </table>
                            </#if>
                        </td>
                    </tr>
                </#list>
            </table>
        </#if>
    </#if>
</body>

</html>