'use strict';

/**
 * CarController
 * @constructor
 */
var SignInController = function($scope, $http) {
  alert('hi');

	 $scope.list = [];
	 $scope.userName = 'user name';
	 $scope.submit = function() {
	 if ($scope.userName) {
	 $scope.list.push(this.userName);
	 $scope.userName = '';
	 }
	 };
}