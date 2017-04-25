angular.module('app.services', []).factory('Shipwreck', function($resource) {
  return $resource('/chocolateHome/chocolist', { id: '@id' }, {
    update: {
      method: 'PUT'
    }
  });
}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
});
