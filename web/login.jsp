<%-- 
    Document   : login
    Created on : 21/06/2016, 06:48:14 PM
    Author     : Andrew
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <!--Bootstrap-->
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/animate.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/custom.css" rel="stylesheet" type="text/css"/>
    </head>
    <body style="background:#F7F7F7;">
        <div class="">
            <a class="hiddenanchor" id="toregister"></a>
            <a class="hiddenanchor" id="tologin"></a>

            <div id="wrapper">
                <div id="login" class="animate form">
                    <section class="login_content">
                        <form method="post" action="log">
                            <h1>Ingresar</h1>
                            <div>
                                <input name="user" type="text" class="form-control" placeholder="Usuario" />
                            </div>
                            <div>
                                <input name="pass" type="password" class="form-control" placeholder="Password"/>
                            </div>
                            <div>
                                <button type="submit" class="btn btn-success" style="width: 100%;">Ingresar</button>
                            </div>
                            <div class="clearfix"></div>
                            <div class="separator">
                                <br />
                                <div>
                                    <h1><i class="" style="font-size: 26px;"></i> Jeffrey Vargas</h1>
                                    <p>©2016</p>
                                </div>
                            </div>
                        </form>
                    </section>
                </div>

            </div>
        </div>

    </body>
</html>
