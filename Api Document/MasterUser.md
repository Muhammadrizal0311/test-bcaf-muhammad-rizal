# User Doc API

## Get All Users
Endpoint : "localhost:8090/api/users"
Method : Get
Response Body :
```
[
    {
        "id": 1,
        "username": "Muhammad Rizal Ganteng",
        "password": "Rizal",
        "createDateTime": null,
        "createdBy": "Lukluk Santoso",
        "statusUser": "Ok",
        "idMenu": 1,
        "idCabang": 1,
        "groupUser": 1,
        "idArea": 1
    },
    {
        "id": 2,
        "username": "Muhammad Deri Hermawan",
        "password": "Deri",
        "createDateTime": null,
        "createdBy": "Lukluk Santoso",
        "statusUser": "Ok",
        "idMenu": 1,
        "idCabang": 1,
        "groupUser": 1,
        "idArea": 1
    },
    {
        "id": 3,
        "username": "Andika Alvianto",
        "password": "Andika",
        "createDateTime": null,
        "createdBy": "Lukluk Santoso",
        "statusUser": "Ok",
        "idMenu": 1,
        "idCabang": 1,
        "groupUser": 1,
        "idArea": 1
    },
    {
        "id": 4,
        "username": "Ade Prayoga",
        "password": "Ade",
        "createDateTime": null,
        "createdBy": "Lukluk Santoso",
        "statusUser": "Ok",
        "idMenu": 1,
        "idCabang": 1,
        "groupUser": 1,
        "idArea": 1
    },
    {
        "id": 6,
        "username": "Ade Prayoga",
        "password": "Ade",
        "createDateTime": null,
        "createdBy": "Lukluk Santoso",
        "statusUser": "Ok",
        "idMenu": 1,
        "idCabang": 1,
        "groupUser": 1,
        "idArea": 1
    }
]
```
## Get One User
Endpoint : "localhost:8090/api/users/{id}"
Method : Get
Response Body :
```
    {
        "id": 1,
        "username": "Muhammad Rizal",
        "password": "Rizal",
        "createDateTime": null,
        "createdBy": "Lukluk Santoso",
        "statusUser": "Ok",
        "idMenu": 1,
        "idCabang": 1,
        "groupUser": 1,
        "idArea": 1
    }
```
## Create Users
Endpoint : "localhost:8090/api/users"
Method : Post
Request Body :

```
{
    "username" : "Ade Prayoga", // Tidak Boleh Kosong
    "password": "Ade", // Tidak Boleh Kosong
    "createdDate": "Januari 2020",
    "createdBy" : "Lukluk Santoso", // Tidak Boleh Kosong
    "statusUser" : "Ok", // Tidak Boleh Kosong
    "idMenu" : 1,
    "idCabang" : 1,
    "groupUser":1,
    "idArea":1
}
```

Fitur : Validate (Username, Password, CreatedDate, CreatedBy, StatusUser);

Response Body :
Jika tidak terpenuhi, akan mengembalikan eror sebagai berikut :
```
{
    "password": "password tidak boleh kosong !!!",
    "statusUser": "status User tidak boleh kosong !!!",
    "createdBy": "Created By tidak boleh kosong !!!",
    "username": "Username tidak boleh kosong !!!"
}
```
Jika berhasil dan terpenuhi semuanya :

```
    {
        "id": 4,
        "username": "Ade Prayoga",
        "password": "Ade",
        "createDateTime": null,
        "createdBy": "Lukluk Santoso",
        "statusUser": "Ok",
        "idMenu": 1,
        "idCabang": 1,
        "groupUser": 1,
        "idArea": 1
    }
```

## Update Users
Endpoint : "localhost:8090/api/users"
Method : Put
Request Body :
```
{
    "id":"1",
    "username" : "Muhammad Rizal Ganteng", // Tidak Boleh Kosong
    "password": "Rizal", // Tidak Boleh Kosong
    "createdDate": "Januari 2020", // Tidak Boleh Kosong
    "createdBy" : "Lukluk Santoso", // Tidak Boleh Kosong
    "statusUser" : "Ok", // Tidak Boleh Kosong
    "idMenu" : 1,
    "idCabang" : 1,
    "groupUser":1,
    "idArea":1

}
```
Response Body :
Fitur : Validate (Username, Password, CreatedDate, CreatedBy, StatusUser);

Jika tidak terpenuhi, akan mengembalikan eror sebagai berikut :
```
{
    "password": "password tidak boleh kosong !!!",
    "statusUser": "status User tidak boleh kosong !!!",
    "createdBy": "Created By tidak boleh kosong !!!",
    "username": "Username tidak boleh kosong !!!"
}
```
Jika berhasil dan terpenuhi semuanya :

```
    {
        "id":"1",
        "username" : "Muhammad Rizal Ganteng",
        "password": "Rizal",
        "createdDate": "Januari 2020",
        "createdBy" : "Lukluk Santoso",
        "statusUser" : "Ok",
        "idMenu" : 1,
        "idCabang" : 1,
        "groupUser":1,
        "idArea":1
    }
```


## Delete Users
Endpoint : "localhost:8090/api/users/{id}"
Method : Delete
Response Body :
```
    Data Berhasil di Hapus !!!
```
