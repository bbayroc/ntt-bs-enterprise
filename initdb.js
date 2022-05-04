db.createCollection('Enterprise');
db.Enterprise.insertMany(
    [{
       "_id": 1,
       "name": "Luis",
       "lastname": "Bravo Evaristo",
       "email": "lbravo@gmail.com",
       "dni": "84662894",
       "phone": 982681358,
       "clienttype": "Enterprise",
       "signer": "none",
       "_class": "com.example.enterprise.entity.Enterprise"
    },{
       "_id": 2,
       "name": "Faustino",
       "lastname": "Carbajal Dominguez",
       "email": "fcarbajal@gmail.com",
       "dni": "55021371",
       "phone": 947383561,
       "clienttype": "Enterprise",
       "signer": "none",
       "_class": "com.example.enterprise.entity.Enterprise"
    }]
)
