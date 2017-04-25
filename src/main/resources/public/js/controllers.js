angular.module('app.controllers', []).controller('ChocolatesListController', function($scope, $state, popupService, $window, Shipwreck) {
  $scope.chocolates = Shipwreck.query(); //fetch all shipwrecks. Issues a GET to /api/vi/shipwrecks

  $scope.deleteShipwreck = function(shipwreck) { // Delete a Shipwreck. Issues a DELETE to /api/v1/shipwrecks/:id
    if (popupService.showPopup('Really delete this?')) {
      shipwreck.$delete(function() {
        $scope.shipwrecks = Shipwreck.query(); 
        $state.go('shipwrecks');
      });
    }
  };
}).controller('ChocolateViewController', function($scope, $stateParams, chocolates) {
	console.log('ChocolateViewController invoked');
	console.log($stateParams.id);
  $scope.chocolate = chocolates.get({ id: '01256e18e93b40a34d276fc71945926680d9e72d' }); //Get a single shipwreck.Issues a GET to /api/v1/shipwrecks/:id
}).controller('ShipwreckCreateController', function($scope, $state, $stateParams, Shipwreck) {
  $scope.shipwreck = new Shipwreck();  //create new shipwreck instance. Properties will be set via ng-model on UI

  $scope.addChocolate = function() { //create a new Chocolate. Issues a POST request to 
    $scope.shipwreck.$save(function() {
      $state.go('shipwrecks'); // on success go back to the list i.e. shipwrecks state.
    });
  };
}).controller('ShipwreckEditController', function($scope, $state, $stateParams, Shipwreck) {
  $scope.updateShipwreck = function() { //Update the edited shipwreck. Issues a PUT to /api/v1/shipwrecks/:id
    $scope.shipwreck.$update(function() {
      $state.go('shipwrecks'); // on success go back to the list i.e. shipwrecks state.
    });
  };

  $scope.loadShipwreck = function() { //Issues a GET request to /api/v1/shipwrecks/:id to get a shipwreck to update
    $scope.shipwreck = Shipwreck.get({ id: $stateParams.id });
  };

  $scope.loadShipwreck(); // Load a shipwreck which can be edited on UI
});
