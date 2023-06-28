<%-- 
    Document   : login
    Author     : santos
--%>
<!DOCTYPE html>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Skydash Admin</title>
  <!-- plugins:css -->
  <link rel="stylesheet" href="recursos/vendors/feather/feather.css">
  <link rel="stylesheet" href="recursos/vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" href="recursos/vendors/css/vendor.bundle.base.css">
  <!-- endinject -->
  <!-- Plugin css for this page -->
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="recursos/css/vertical-layout-light/style.css">
  <!-- endinject -->
  <link rel="shortcut icon" href="recursos/images/favicon.png" />
</head>

<body>
  <div class="container-scroller">
    <div class="container-fluid page-body-wrapper full-page-wrapper">
      <div class="content-wrapper d-flex align-items-center auth px-0">
        <div class="row w-100 mx-0">
          <div class="col-lg-4 mx-auto">
            <div class="auth-form-light text-left py-5 px-4 px-sm-5">
              <div class="brand-logo">
                <img src="recursos/images/logo.svg" alt="logo">
              </div>
              <h4>�Hola! empecemos</h4>
              <h6 class="font-weight-light">Inicia sesi�n para continuar.</h6>
              <form class="pt-3" action="Login" method="POST">
                <div class="form-group">
                    <input type="email" class="form-control form-control-lg" id="exampleInputEmail1" name="email" placeholder="Username">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control form-control-lg" id="exampleInputPassword1" name="password" placeholder="Password">
                </div>
                <div class="mt-3">
                    <button class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn" type="submit">Ingresar</button>
                  <!--<a class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn" href="">SIGN IN</a>-->
                </div>
                
                
                <div class="text-center mt-4 font-weight-light">
                  �No tienes una cuenta? <a href="#" class="text-primary">Contactanos</a>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
      <!-- content-wrapper ends -->
    </div>
    <!-- page-body-wrapper ends -->
  </div>
  <!-- container-scroller -->
  <!-- plugins:js -->
  <script src="recursos/vendors/js/vendor.bundle.base.js"></script>
  <!-- endinject -->
  <!-- Plugin js for this page -->
  <!-- End plugin js for this page -->
  <!-- inject:js -->
  <script src="recursos/js/off-canvas.js"></script>
  <script src="recursos/js/hoverable-collapse.js"></script>
  <script src="recursos/js/template.js"></script>
  <script src="recursos/js/settings.js"></script>
  <script src="recursos/js/todolist.js"></script>
  <!-- endinject -->
</body>

</html>
