var app = angular.module('app', [ 'angular-loading-bar' ]);

app.config([ 'cfpLoadingBarProvider', function(cfpLoadingBarProvider) {
	cfpLoadingBarProvider.includeSpinner = true; // Show the spinner.
	cfpLoadingBarProvider.includeBar = true; // Show the bar.
} ]);

		 

app.controller('getAllDeptController', function($scope, $http, $location) {

	$scope.showAllStaffList = false;

	$scope.submitAddNewDeptForm = function() {
		 

		var postData = {
			 
				deptId : $scope.deptId,
				deptName : $scope.deptName,

			 
		};

		$http({
			method : 'POST',
			url : '/api/hr/addDepartmentDetails',
			data : postData
		}).then(function successCallback(response) {
			 
			refreshDataTable();

		}, function errorsCallback(response) {
			console.log(respose);

			alert("error");
		});

	}
	
	$scope.init = function() {


		refreshDataTable();


	};
	
	
	function refreshDataTable()
	{
		 
		$http({
			method : 'GET',
			url : '/api/hr/getDeptDetails',
			 
		}).then(
				function successCallback(response) {	

					$scope.allStaffList = response.data;

				//	$('#deptListTable').DataTable().clear();

					//angular.forEach($scope.allStaffList, function(item, index) {
					//	console.log(item, index)

						/*$('#deptListTable').DataTable().row.add(
								[ item.deptName, '<button  ng-click="myFunc()">Edit</button>']).draw();*/
						
						   $scope.department = response.data;
				//		'+item.deptId+',\''+item.deptName+'\'
				//	})
						//   cfpLoadingBarProvider.includeBar = false; // Show the bar.
				}, function errorsCallback(response) {
					console.log(respose)
					//cfpLoadingBarProvider.includeBar = false; // Show the bar.
				});
		
	}
	
	
	 $scope.editDepartment = function(department) {
	 
		 $scope.deptId = department.deptId;
		 $scope.deptName = department.deptName;
		$('#deptName').focus();
	    }; 
	 
	  
	 
	    
});

 

/*
function updateDept(deptId, deptName) {
 
 $("#deptId").val(deptId);
	$("#deptName").val(deptName); 
}*/