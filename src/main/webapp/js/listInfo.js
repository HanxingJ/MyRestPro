$(function(){
    var projectName = getProjectName();
    $.ajax({
        type: 'GET',
        url: projectName+"/projects",
        processData: false,
        contentType: false,
        async:true,
        success: function(result) {
            var html  = $("#list").render(result);
            $("#listInfo").html(html);
            //alert(html);
        }
    });


    $("#addProjectInfo").click(function () {
        window.location.href="content/add.html";
    });

    $("#deleteProjectInfo").click(function(){
        //alert("删除");
        var id = 1;
        $.ajax({
            type: 'DELETE',
            url: projectName+"/project/"+id,
            processData: false,
            contentType: false,
            async:true,
            success: function(result) {
                var html  = $("#list").render(result);
                $("#listInfo").html(html);
                //alert(html);
            }
        });
    });

    //获取当前项目名称
    function getProjectName(){
        var curWwwPath=window.document.location.href;

        //获取主机地址之后的目录如：/Tmall/index.jsp
        var pathName=window.document.location.pathname;
        var pos=curWwwPath.indexOf(pathName);

        //获取主机地址，如：//localhost:8080
        var localhostPaht=curWwwPath.substring(0,pos);

        //获取带"/"的项目名，如：/Tmall
        var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
        return projectName;
    }
});

//修改
function modify(projectNo) {
    $.ajax({
        type: 'DELETE',
        url: "delete",
        processData: false,
        contentType: false,
        async:true,
        success: function(result) {
            var html  = $("#list").render(result);
            $("#listInfo").html(html);
            alert(html);
        }
    });


}






