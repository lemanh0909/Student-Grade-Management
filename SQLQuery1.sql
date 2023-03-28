CREATE TABLE Campus (
	CampusID int Primary key,
	CampusName varchar(50)
);

CREATE TABLE LectureAccount (
	LectureID varchar(8) PRIMARY KEY FOREIGN KEY REFERENCES Lecture,
	[password] varchar(50)
);
CREATE TABLE Student (
	StudentID varchar(8) PRIMARY KEY,
	StudentName varchar(50),
	gender bit,
	Dob date,
	CampusID int FOREIGN KEY REFERENCES Campus(CampusID)
);
CREATE TABLE Lecture (
	LectureID varchar(8) PRIMARY KEY,
	LectureName varchar(50),
	[password] varchar(50),
	CampusID int FOREIGN KEY REFERENCES Campus(CampusID)
);
CREATE TABLE Grade (
	StudentID varchar(8) FOREIGN KEY REFERENCES Student(StudentID),
	SubjectID varchar(8),
	Mark float,
	CONSTRAINT [PK_Grade] PRIMARY KEY (StudentID, SubjectID)
);

INSERT INTO Campus(CampusID, CampusName)
VALUES (1, 'FU-Hòa L?c'),
(2, 'FU-H? Chí Minh'),
(3, 'FU-?à N?ng'),
(4, 'FU-C?n Th?')
CREATE TABLE StudentAccount (
	StudentID varchar(8) FOREIGN KEY REFERENCES Student(StudentID),
	[password] varchar(50)
	CONSTRAINT [PK_SA] PRIMARY KEY (StudentID)
);
INSERT INTO Lecture(LectureID, LectureName, [password], CampusID)
VALUES ('HE160520', 'Le Duc Manh', '09092002',1)

INSERT INTO Student(StudentID, StudentName, gender, Dob, CampusID)
VALUES('HE160001', 'Hoang Phi Huynh', 0, '2002-05-12',3),
('HE160002', 'Trinh Nhat Mai', 1, '2002-05-16',2),
('HE160003', 'Dinh Nhat Tuan', 0, '2002-07-20',1),
('HE160004', 'Dao Quang Minh', 0, '2002-04-09',4),
('HE160005', 'Dinh Thanh Xuan', 1, '2002-01-01',3),
('HE160006', 'Mai Nhat Ha', 0, '2002-04-04',2),
('HE160007', 'Thien Tro Thu', 1, '2002-08-01',1),
('HE160008', 'Pham Tan Dong', 0, '2002-10-12',4),
('HE160009', 'Vu Van Vu', 0, '2002-05-12',3),
('HE160010', 'Vu Thu Ha', 1, '2002-07-29',2),
('HE160011', 'Pham Xuan Luan', 0, '2002-01-12',1),
('HE160012', 'Mai Huy Hoang', 0, '2002-12-25',4),
('HE160013', 'Phan Tan Son', 1, '2002-11-23',3),
('HE160014', 'Hoang Ha Mi', 0, '2002-05-09',2),
('HE160015', 'Nguyen Bich Ngoc', 0, '2002-10-03',1),
('HE160016', 'Nguyen Minh Duc', 0, '2002-08-22',4)

INSERT INTO Grade(StudentID, SubjectID, Mark)
VALUES('HE160001', 'MAE101',5),
('HE160002', 'MAE101', 7.9),
('HE160003', 'MAE101', 4),
('HE160004', 'MAE101', 9),
('HE160005', 'MAE101',7.2),
('HE160006', 'MAE101', 8.6),
('HE160007', 'MAE101', 4),
('HE160008', 'MAE101', 9),
('HE160009', 'MAE101',5.5),
('HE160010', 'MAE101', 8.7),
('HE160011', 'MAE101', 4.9),
('HE160012', 'MAE101', 9.5),
('HE160013', 'MAE101',8.5),
('HE160014', 'MAE101', 7.6),
('HE160015', 'MAE101', 10),
('HE160016', 'MAE101', 9)


INSERT INTO Grade(StudentID, SubjectID, Mark)
VALUES('HE160001', 'DBI202',5),
('HE160002', 'DBI202', 7.9),
('HE160003', 'DBI202', 4),
('HE160004', 'DBI202', 9),
('HE160005', 'DBI202',7.2),
('HE160006', 'DBI202', 8.6),
('HE160007', 'DBI202', 4),
('HE160008', 'DBI202', 9),
('HE160009', 'DBI202',5.5),
('HE160010', 'DBI202', 8.7),
('HE160011', 'DBI202', 4.9),
('HE160012', 'DBI202', 9.5),
('HE160013', 'DBI202',8.5),
('HE160014', 'DBI202', 7.6),
('HE160015', 'DBI202', 10),
('HE160016', 'DBI202', 9)

INSERT INTO Grade(StudentID, SubjectID, Mark)
VALUES('HE160001', 'JPD123',5),
('HE160002', 'JPD123', 7.9),
('HE160003', 'JPD123', 4),
('HE160004', 'JPD123', 9),
('HE160005', 'JPD123',7.2),
('HE160006', 'JPD123', 8.6),
('HE160007', 'JPD123', 4),
('HE160008', 'JPD123', 9),
('HE160009', 'JPD123',5.5),
('HE160010', 'JPD123', 8.7),
('HE160011', 'JPD123', 4.9),
('HE160012', 'JPD123', 9.5),
('HE160013', 'JPD123',8.5),
('HE160014', 'JPD123', 7.6),
('HE160015', 'JPD123', 10),
('HE160016', 'JPD123', 9)

INSERT INTO Grade(StudentID, SubjectID, Mark)
VALUES('HE160001', 'PRO192',5.5),
('HE160002', 'PRO192', 8.2),
('HE160003', 'PRO192', 4.3),
('HE160004', 'PRO192', 9.3),
('HE160005', 'PRO192',7.5),
('HE160006', 'PRO192', 8.9),
('HE160007', 'PRO192', 4.4),
('HE160008', 'PRO192', 9.4),
('HE160009', 'PRO192',5.8),
('HE160010', 'PRO192', 8.2),
('HE160011', 'PRO192', 5.6),
('HE160012', 'PRO192', 9.8),
('HE160013', 'PRO192',8.8),
('HE160014', 'PRO192', 7.9),
('HE160015', 'PRO192', 9.5),
('HE160016', 'PRO192', 9)

INSERT INTO Grade(StudentID, SubjectID, Mark)
VALUES('HE160001', 'MAD101',6.8),
('HE160002', 'MAD101', 7),
('HE160003', 'MAD101', 4.8),
('HE160004', 'MAD101', 9.6),
('HE160005', 'MAD101',6.5),
('HE160006', 'MAD101', 7.5),
('HE160007', 'MAD101', 4.8),
('HE160008', 'MAD101', 7.9),
('HE160009', 'MAD101',6.9),
('HE160010', 'MAD101', 7.8),
('HE160011', 'MAD101', 6.9),
('HE160012', 'MAD101', 8.5),
('HE160013', 'MAD101',7.5),
('HE160014', 'MAD101', 8.6),
('HE160015', 'MAD101', 10),
('HE160016', 'MAD101', 8)

INSERT INTO StudentAccount(StudentID, [password])
VALUES('HE160001', '123'),
('HE160002', '123'),
('HE160003', '123'),
('HE160004', '123'),
('HE160005', '123'),
('HE160006', '123'),
('HE160007', '123'),
('HE160008', '123'),
('HE160009', '123'),
('HE160010', '123'),
('HE160011', '123'),
('HE160012', '123'),
('HE160013', '123'),
('HE160014', '123'),
('HE160015', '123'),
('HE160016', '123')