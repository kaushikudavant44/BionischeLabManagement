var app = angular.module('app', [ 'angular-loading-bar' ]);

app.config([ 'cfpLoadingBarProvider', function(cfpLoadingBarProvider) {
	cfpLoadingBarProvider.includeSpinner = true; // Show the spinner.
	cfpLoadingBarProvider.includeBar = true; // Show the bar.
} ]);

/*
 * app.controller('postController', function($scope, $http, $location) {
 * $scope.submitForm = function(){
 * 
 * cfpLoadingBar.start(); // Start loading. alert("inside Controller method");
 * var url = $location.$$absUrl+ "postcustomer";
 * 
 * var config = { headers : { 'Content-Type': 'application/json;charset=utf-8;' } }
 * 
 * var data = { firstName: $scope.firstname, lastName: $scope.lastname };
 * 
 * 
 * 
 * (url, data, config).then(function (response) { cfpLoadingBar.complete(); //
 * End loading.
 * 
 * $scope.postResultMessage = "Successful !"; }, function (response) {
 * cfpLoadingBar.complete(); // End loading.
 * 
 * $scope.postResultMessage = "Fail!"; });
 * 
 * $scope.firstname = ""; $scope.lastname = ""; } });
 */


//define a service named myService
app.service('myService', function () {
  this.message = '';
  this.setMessage = function (newMessage) {
      this.message = newMessage;
      return this.message;
  };
});



app.controller('postController', function($scope, $http, $location) {
	$scope.submitAddNewStaffForm = function() {

		alert("inside Controller method");

		var postData = {
			labId : sessionStorage.getItem('labId'),

			branchId : sessionStorage.getItem('branchId'),

			staffName : $scope.name,

			staffMobile : $scope.mobileNo,

			password : $scope.password,

			staffRoleType : $scope.accessRole,

			isUsed : 1
		};

		$http({
			method : 'POST',
			url : '/api/lab/addLabStaff',
			data : postData
		}).then(function successCallback(response) {

			$window.location.reload();

		}, function errorsCallback(response) {
			console.log(respose);

			alert("error");
		});

	}
});

app.controller('getAllStaffController', function($scope, $http, $location) {

	$scope.showAllStaffList = false;

	$scope.init = function() {


		var branchId = sessionStorage.getItem('branchId');

		$http({
			method : 'POST',
			url : '/api/lab/getLabStaffByBranchId',
			params : {
				'branchId' : branchId
			}
		}).then(
				function successCallback(response) {	

					$scope.allStaffList = response.data;

					$('#staffListTable').DataTable().clear();

					angular.forEach($scope.allStaffList, function(item, index) {
						console.log(item, index)

						$('#staffListTable').DataTable().row.add(
								[ item.staffName, item.staffName,
										item.staffMobile ]).draw();

					})

				}, function errorsCallback(response) {
					console.log(respose)
				});

	};

	$scope.getAllStaffList = function() {

		// var url = $location.absUrl() + "findall";

		/*
		 * var url = $location.$$absUrl+"findall";
		 * 
		 * var config = { headers : { 'Content-Type' :
		 * 'application/json;charset=utf-8;' } }
		 * 
		 * $http.get(url, config).then(function(response) {
		 * 
		 * if (response.data.status == "Done") {
		 * 
		 * $scope.allcustomers = response.data; $scope.showAllCustomers = true;
		 * $scope.getResultMessage = "List of customers."; } else {
		 * $scope.getResultMessage = "get All Customers Data Error !"; } },
		 * function(response) { $scope.getResultMessage = "Fail!"; });
		 */

		$http({
			method : 'POST',
			url : '/api/lab/getLabStatffByBranchId',
			params : {
				'branchId' : 1
			}
		}).then(
				function successCallback(response) {

					$scope.allStaffList = response.data;

					$('#staffListTable').DataTable().clear();

					angular.forEach($scope.allStaffList, function(item, index) {
						console.log(item, index)

						$('#staffListTable').DataTable().row.add(
								[ item.staffName, item.staffName,
										item.staffMobile ]).draw();

					})

				}, function errorsCallback(response) {
					console.log(respose)
				});

	}
});

/*
 * app.controller('getcustomerController', function($scope, $http, $location) {
 * 
 * $scope.showCustomer = false;
 * 
 * $scope.getCustomer = function() {
 * 
 * 
 * var url = $location.$$absUrl+ + "customer/" + $scope.customerId;
 * 
 * var config = { headers : { 'Content-Type' : 'application/json;charset=utf-8;' } }
 * 
 * $http.get(url, config).then(function(response) {
 * 
 * if (response.data.status == "Done") { $scope.customer = response.data;
 * $scope.showCustomer = true; } else { $scope.getResultMessage = "Customer Data
 * Error !"; } }, function(response) { $scope.getResultMessage = "Fail !"; }); //
 * $http({ method : 'GET', url : 'customerbyId', params: { 'id' :
 * $scope.customerId } }).then(function successCallback(response) {
 * $scope.customer = response.data; $scope.showCustomer = true; }, function
 * errorCallback(response) { $scope.getResultMessage = "Customer Data Error !";
 * console.log(response.statusText); }); // } });
 */

