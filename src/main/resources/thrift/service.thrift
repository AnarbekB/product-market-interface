namespace java ru.balmukanov.productmarketinterface.thrift

exception ProductNotFoundException {
    1: i32 code,
    2: string description
}

enum ProductType {
    CARD = 1,
    ACCOUNT = 2,
    DEPOSIT = 3,
    LOAD = 4
}

struct CreateProductDto {
    1: required string externalId,
    2: required string name,
    3: required ProductType type,
    4: required string agreementId,
    5: required i64 userId,
    6: required bool active
}

struct ProductDto {
    1: required i64 id,
    2: required string externalId,
    3: required string name,
    4: required ProductType type,
    5: required string agreementId,
    6: required i64 userId,
    7: required bool active
}

service ProductMarketThriftService {

    ProductDto get(1:i64 id) throws (2:ProductNotFoundException nfe),

    list<ProductDto> userList(1:i64 userId),

    ProductDto save(1:CreateProductDto product),
}