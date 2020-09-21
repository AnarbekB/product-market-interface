namespace java ru.balmukanov.productmarketinterface.thrift

exception ProductNotFoundException {
    1: i32 code,
    2: string description
}

exception InvalidOperationException {
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
    6: i32 userId
}

service ProductMarketThriftService {

    ProductDto get(1:i64 id) throws (1:InvalidOperationException e, 2:ProductNotFoundException nfe),

    void save(1:ProductDto product) throws (1:InvalidOperationException e),

    bool ping() throws (1:InvalidOperationException e)
}