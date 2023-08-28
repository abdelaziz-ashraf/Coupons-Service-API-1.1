# Coupons Service API

This API provides a RESTful interface for managing coupons and consumption history with the following features:

* Create new coupon with a specified value or percentage.
* You can specify the maximum number of uses and the expiry date. 
* Deactivate coupon by code
* Read all coupons and active coupons
* Read the consumption history fo all coupons or a spacific coupon by code

> Live Preview: [https://product-catalog-api-service.onrender.com/swagger-ui/index.html#/](https://coupon-service-api.onrender.com/swagger-ui/index.html#/)

## Getting Started

To get started with the API, you will need to install the following dependencies:

* Java 17
* Maven
* Postgresql 

Once you have installed the dependencies you can clone the repository 

## Usage

To use the API, you will need to make RESTful requests to the following endpoints:

* `/coupons`: The endpoint for managing coupons
* `/consumption-history`: The endpoint for managing consumption history

For more information on how to use the API, please refer to the Swagger documentation.


## Technologies

The following technologies are used in the development of the API:

* Springboot
* SpringDataJPA
* MapStruct
* Lombok
* Postgresql
* Maven
* Swagger

## License

The API is licensed under the Abdelaziz License, Version 3.1.
