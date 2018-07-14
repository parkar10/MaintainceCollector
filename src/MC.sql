create database MC

use MC

create table House(
 houseId varchar(20) primary key,
 buildingNo varchar(10),
 roomNo int,
 ownerName varchar(40),
 typeOFresidence varchar(10),
 tenantName varchar(40),
 memberCount int,
rent int,
 tWheeler int,
 fWheeler int,
 pendingCharges int, 
 fine int,
 floorNo int

)

create table Society(
sName varchar(50) primary key,
sAddress varchar(60),
totalBuldings int,
ownerRent int,
tenantRent int,
tWheelerRent int,
fWheelerRent int,
availableMoney int,
password varchar(20),
setKey int
)


create table Month(
mId int IDENTITY(1,1)
electricityBill int,
waterBill int,
activites varchar(50),
activitesSpent int,
totalSpent int,
totalEarning int,
totalSaving int
)


create table Building(
bNo varchar(8) primary key,
floors int,
roomsOnFloor int,
totalRooms int,
totalOwners int,
totalTenant int,
tWheeler int,
fWheeler int,
)

create table InfoMonth(
mId int IDENTITY(1,1) PRIMARY KEY,
ODidntPay int,
TDidntPay int,
housesDidntPay int,
housesPaid int,
rentCollected int,
rentExpected int,
rentMissed int,
currentBalance int, 
cMonth varchar(10),
cYear int
)

Create table TransactionLog(
tId int IDENTITY(1,1) PRIMARY KEY,
tDate datetime,
houseId varchar(20),
amount int,
tofMonth varchar(20),
tofYear int
)

Create table EventsLog(
eId int IDENTITY(1,1) PRIMARY KEY,
eDate datetime,
moneyAvailable int,
amount int,
eMonth varchar(20),
eventName int
)

