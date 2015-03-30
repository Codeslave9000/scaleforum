/**
 * Created by ccebelenski on 3/30/2015.
 */

var scaleforumapp = angular.module('scapeforumapp', ['ui.router', 'ng-cookies']);
var scaleforumControllers = angular.module('scaleforumControllers', []);

scaleforumapp.config(function($stateProvider) {
    $stateProvider.state('index', {
        url: "",
        views: {
            "Header": {templateUrl: "partials/forumlist.html"},
            "Breadcrumb": {templateUrl: "partials/breadcrumb.html"},
            "ForumList": {templateUrl: "partials/forum.html"}
        }
    })
});

scaleforumControllers.controller('ForumListController', ['$scope', '$http',
    function ($scope, $http) {

    }
]);
