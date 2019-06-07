<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<title>Add New Vendor</title>
<!-- Favicon-->
<link rel="icon" href="../../favicon.ico" type="image/x-icon">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet" type="text/css">

<!-- Bootstrap Core Css -->
<link href="../../plugins/bootstrap/css/bootstrap.css" rel="stylesheet">

<!-- Waves Effect Css -->
<link href="../../plugins/node-waves/waves.css" rel="stylesheet" />

<!-- Animation Css -->
<link href="../../plugins/animate-css/animate.css" rel="stylesheet" />

<!-- JQuery DataTable Css -->
<link
	href="../../plugins/jquery-datatable/skin/bootstrap/css/dataTables.bootstrap.css"
	rel="stylesheet">

<!-- Custom Css -->
<link href="../../css/style.css" rel="stylesheet">

<!-- AdminBSB Themes. You can choose a theme from css/themes instead of get all themes -->
<link href="../../css/themes/all-themes.css" rel="stylesheet" />









<!-- Favicon-->
<link rel="icon" href="../../favicon.ico" type="image/x-icon">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet" type="text/css">

<!-- Bootstrap Core Css -->
<link href="../../plugins/bootstrap/css/bootstrap.css" rel="stylesheet">

<!-- Waves Effect Css -->
<link href="../../plugins/node-waves/waves.css" rel="stylesheet" />

<!-- Animation Css -->
<link href="../../plugins/animate-css/animate.css" rel="stylesheet" />

<!-- Colorpicker Css -->
<link
	href="../../plugins/bootstrap-colorpicker/css/bootstrap-colorpicker.css"
	rel="stylesheet" />

<!-- Dropzone Css -->
<link href="../../plugins/dropzone/dropzone.css" rel="stylesheet">

<!-- Multi Select Css -->
<link href="../../plugins/multi-select/css/multi-select.css"
	rel="stylesheet">

<!-- Bootstrap Spinner Css -->
<link href="../../plugins/jquery-spinner/css/bootstrap-spinner.css"
	rel="stylesheet">

<!-- Bootstrap Tagsinput Css -->
<link href="../../plugins/bootstrap-tagsinput/bootstrap-tagsinput.css"
	rel="stylesheet">

<!-- Bootstrap Select Css -->
<link href="../../plugins/bootstrap-select/css/bootstrap-select.css"
	rel="stylesheet" />

<!-- noUISlider Css -->
<link href="../../plugins/nouislider/nouislider.min.css"
	rel="stylesheet" />

<!-- Custom Css -->
<link href="../../css/style.css" rel="stylesheet">

<!-- AdminBSB Themes. You can choose a theme from css/themes instead of get all themes -->
<link href="../../css/themes/all-themes.css" rel="stylesheet" />




</head>

<body class="theme-red">
	<!-- Page Loader -->
	<div class="page-loader-wrapper">
		<div class="loader">
			<div class="preloader">
				<div class="spinner-layer pl-red">
					<div class="circle-clipper left">
						<div class="circle"></div>
					</div>
					<div class="circle-clipper right">
						<div class="circle"></div>
					</div>
				</div>
			</div>
			<p>Please wait...</p>
		</div>
	</div>

	<!-- #END# Page Loader -->
	<!-- Overlay For Sidebars -->
	<div class="overlay"></div>
	<!-- #END# Overlay For Sidebars -->
	<!-- Search Bar -->

	<!-- #END# Search Bar -->
	<!-- Top Bar -->
	<nav class="navbar">

		<jsp:include page="/WEB-INF/views/common/top-menu.jsp"></jsp:include>
	</nav>
	<!-- #Top Bar -->


	<section>
		<!-- Left Sidebar -->
		<jsp:include page="/WEB-INF/views/common/navigation-menu.jsp"></jsp:include>

		<!-- #Left Sidebar -->
	</section>





	<section class="content">
		<div class="container-fluid"></div>



		<div class="row clearfix">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="card">
					<div class="header">


						<h2 class="card-inside-title">ADD NEW VENDOR</h2>

					</div>
					<div class="body">
						<div class="row clearfix">



							<div class="col-md-4">
								<b>Name</b>
								<div class="input-group">
									<span class="input-group-addon"> <i
										class="material-icons">person</i>
									</span>
									<div class="form-line">
										<input type="text" class="form-control" placeholder="">
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<b>Mobile Number</b>
								<div class="input-group">
									<span class="input-group-addon"> <i
										class="material-icons">phone_iphone</i>
									</span>
									<div class="form-line">
										<input type="text" class="form-control mobile-phone-number"
											placeholder="">
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<b>Address</b>
								<div class="input-group">
									<span class="input-group-addon"> <i
										class="material-icons">edit_location</i>
									</span>
									<div class="form-line">
										<input type="text" class="form-control" placeholder="">
									</div>
								</div>
							</div>

						</div>

						<div class="row clearfix">

							<div class="col-md-4">
								<b>GST NO.</b>
								<div class="input-group">
									<span class="input-group-addon"> <i
										class="material-icons">assignment</i>
									</span>
									<div class="form-line">
										<input type="text" class="form-control" placeholder="">
									</div>
								</div>
							</div>


							<div class="col-md-4">
								<div class="col-md-4">
									<br>

									<button type="submit"
										class="btn btn-block btn-lg btn-primary waves-effect">Submit</button>
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>




		<!-- Basic Examples -->
		<div class="row clearfix">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="card">

					<div class="header">
						<h2>VENDOR LIST</h2>
					</div>

					<div class="body">
						<div class="table-responsive">
							<table
								class="table table-bordered table-striped table-hover js-basic-example dataTable">
								<thead>
									<tr>
										<th>Name</th>
										<th>Mobile No</th>
										<th>Address</th>
										<th>GST NO</th>

									</tr>
								</thead>
								<tfoot>
									<tr>
										<th>Name</th>
										<th>Mobile No</th>
										<th>Address</th>
										<th>GST NO</th>
									</tr>
								</tfoot>
								<tbody>
									<tr>
										<td>Tiger Nixon</td>
										<td>System Architect</td>
										<td>123456</td>
										<td>546546MBNDS</td>
									</tr>
									<tr>
										<td>Garrett Winters</td>
										<td>Accountant</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>
									<tr>
										<td>Ashton Cox</td>
										<td>Junior Technical Author</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>
									<tr>
										<td>Cedric Kelly</td>
										<td>Senior Javascript Developer</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>
									<tr>
										<td>Airi Satou</td>
										<td>Accountant</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>
									<tr>
										<td>Brielle Williamson</td>
										<td>Integration Specialist</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>
									<tr>
										<td>Herrod Chandler</td>
										<td>Sales Assistant</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>
									<tr>
										<td>Rhona Davidson</td>
										<td>Integration Specialist</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>
									<tr>
										<td>Colleen Hurst</td>
										<td>Javascript Developer</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>
									<tr>
										<td>Sonya Frost</td>
										<td>Software Engineer</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>
									<tr>
										<td>Jena Gaines</td>
										<td>Office Manager</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>
									<tr>
										<td>Quinn Flynn</td>
										<td>Support Lead</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>
									<tr>
										<td>Charde Marshall</td>
										<td>Regional Director</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>
									<tr>
										<td>Haley Kennedy</td>
										<td>Senior Marketing Designer</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>
									<tr>
										<td>Tatyana Fitzpatrick</td>
										<td>Regional Director</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>
									<tr>
										<td>Michael Silva</td>
										<td>Marketing Designer</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>
									<tr>
										<td>Paul Byrd</td>
										<td>Chief Financial Officer (CFO)</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>
									<tr>
										<td>Gloria Little</td>
										<td>Systems Administrator</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>
									<tr>
										<td>Bradley Greer</td>
										<td>Software Engineer</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>
									<tr>
										<td>Dai Rios</td>
										<td>Personnel Lead</td>
										<td>123456</td>
										<td>546546MBNDS</td>

									</tr>


								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- #END# Basic Examples -->



	</section>






	<!-- Jquery Core Js -->
	<script src="../../plugins/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core Js -->
	<script src="../../plugins/bootstrap/js/bootstrap.js"></script>

	<!-- Select Plugin Js -->
	<script src="../../plugins/bootstrap-select/js/bootstrap-select.js"></script>

	<!-- Slimscroll Plugin Js -->
	<script src="../../plugins/jquery-slimscroll/jquery.slimscroll.js"></script>

	<!-- Waves Effect Plugin Js -->
	<script src="../../plugins/node-waves/waves.js"></script>

	<!-- Jquery DataTable Plugin Js -->
	<script src="../../plugins/jquery-datatable/jquery.dataTables.js"></script>
	<script
		src="../../plugins/jquery-datatable/skin/bootstrap/js/dataTables.bootstrap.js"></script>
	<script
		src="../../plugins/jquery-datatable/extensions/export/dataTables.buttons.min.js"></script>
	<script
		src="../../plugins/jquery-datatable/extensions/export/buttons.flash.min.js"></script>
	<script
		src="../../plugins/jquery-datatable/extensions/export/jszip.min.js"></script>
	<script
		src="../../plugins/jquery-datatable/extensions/export/pdfmake.min.js"></script>
	<script
		src="../../plugins/jquery-datatable/extensions/export/vfs_fonts.js"></script>
	<script
		src="../../plugins/jquery-datatable/extensions/export/buttons.html5.min.js"></script>
	<script
		src="../../plugins/jquery-datatable/extensions/export/buttons.print.min.js"></script>

	<!-- Custom Js -->
	<script src="../../js/admin.js"></script>
	<script src="../../js/pages/tables/jquery-datatable.js"></script>

	<!-- Demo Js -->
	<script src="../../js/demo.js"></script>



	<!-- Dropzone Plugin Js -->
	<script src="../../plugins/dropzone/dropzone.js"></script>

	<!-- Input Mask Plugin Js -->
	<script src="../../plugins/jquery-inputmask/jquery.inputmask.bundle.js"></script>

	<!-- Multi Select Plugin Js -->
	<script src="../../plugins/multi-select/js/jquery.multi-select.js"></script>

	<!-- Jquery Spinner Plugin Js -->
	<script src="../../plugins/jquery-spinner/js/jquery.spinner.js"></script>

	<!-- Bootstrap Tags Input Plugin Js -->
	<script src="../../plugins/bootstrap-tagsinput/bootstrap-tagsinput.js"></script>



	<script src="../../js/pages/forms/advanced-form-elements.js"></script>


	<script
		src="${pageContext.request.contextPath}/resources/controllerjs/navigation.js"></script>
</body>
</html>