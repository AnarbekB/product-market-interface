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

struct ProductDto {
    1: i64 id,
    2: string externalId,
    3: string name,
    4: ProductType type,
    5: string agreementId,
    6: i64 userId
}

service ProductMarketThriftService {

    ProductDto get(1:i64 id) throws (2:ProductNotFoundException nfe),

    list<ProductDto> userList(1:i64 userId),

    ProductDto save(1:ProductDto product),
}