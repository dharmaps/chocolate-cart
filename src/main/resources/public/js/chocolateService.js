angular.module('app.chocolateServices', []).factory('chocolates', function($resource) {
  return $resource('/chocolateHome/getChocolate', { id: '@id' }, {
    update: {
      method: 'PUT'	
    }
  });
});