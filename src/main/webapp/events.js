function Events($scope, $http) {
    $http.get('http://localhost:8080/spring-mvc4/events.json')
        .success(function (data) {
            $scope.events = data;
        });
}