$('#save').click(function (){
    const id = $('#post-id').val();
    const title = $('#post-title').val();
    const content = $('#post-content').val();

    $.ajax({
        url : "http://localhost:8080/blog/savepost",
        method : "POST",
        contentType : "application/json",
        data : JSON.stringify({
            id : id,
            title : title,
            content : content
        }),
        success : function (data){
            alert("Post saved successfully");
        },
        error : function (error){
            alert("Try Again")
        }
    })
})