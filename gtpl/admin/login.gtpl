<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <style>
    @charset "utf-8";

    * {
        margin: 0;
        padding: 0;
    }

    body {
        height: 100vh;
        background: url(assets/bg.png) no-repeat;
        background-size: cover;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .box {
        width: 400px;
        height: 350px;
        margin:60px 1100px 0 0;
        border-top: 1px solid rgba(255,255,255,0.5);
        border-left: 1px solid rgba(255,255,255,0.5);
        border-bottom: 1px solid rgba(255,255,255,0.3);
        border-right: 1px solid rgba(255,255,255,0.3);
        backdrop-filter: blur(10px);
        background: rgba(50,50,50,0.1);
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        border-radius: 10px;
    }

    .box > h2 {
        color: rgba(255,255,255,0.9);
        margin-bottom: 30px;
    }

    input {
        display: flex;
        flex-direction: column;
        box-sizing: border-box;
        margin-bottom: 10px;
    }


    input[type="password"] {
        letter-spacing: 1px;
        font-size: 14px;
        box-sizing: border-box;
        width: 250px;
        height: 35px;
        border-radius: 5px;
        border: 1px solid rgba(255,255,255,0.5);
        background: rgba(255,255,255,0.2);
        outline: none;
        padding: 0 12px;
        color: rgba(255,255,255,0.9);
        transition: 0.2s;
    }

    input[type="submit"] {
        width: 120px;
        height: 35px;
        margin: 50px 0 0 60px;
        color: rgba(255,255,255,0.9);
        border: 1px solid rgba(192, 119, 91, 0.7);
        background: rgba(192, 119, 91, 0.5);
        justify-content: center;
        align-items: center;
    }

    p{
        margin: 10px 0 0 60px;
        justify-content: center;
        align-items: center;
    }

    </style>
</head>
<body>
    <div class="box">
        <h2>Login</h2>
        <form method="POST"  action="/login">
                <input type="password" name="password">
                <input type="submit">
                <p>{{ . }}</p>
        </form>
    </div>

<script type="text/javascript">

</script>
</body>
</html>