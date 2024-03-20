<%-- 
    Document   : index
    Created on : Feb 2, 2024, 4:10:56 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1, shrink-to-fit=no"
            />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Shop E</title>
        <!-- Favicon -->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
            rel="stylesheet"
            />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
    </head>
    <body>
        <%@include file="panner.jsp" %>

        <section class="py-5">
            <div class="container px-4 px-lg-5 mt-5">
                <!-- Search start -->
                <div class="col mb-5 w-50 offset-md-4">
                    <form action="customer" method="GET" class="input-group">
                        <input
                            type="text"
                            name="keyword"
                            class="form-control"
                            placeholder="Search by product name"
                            style="width: 70%" <!-- Thay đổi chiều rộng của input -->

                        <button class="btn btn-outline-secondary" type="submit">
                            Search
                        </button>
                        <input type="hidden" name="service" value="search">
                    </form>
                </div>

                <!-- Search end --> 
                <div class="row">
                    <%@include file="menu.jsp" %>

                    <%@include file="content.jsp" %>
                </div>
            </div>
        </section>

        <%@include file="footer.jsp" %>


        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>

