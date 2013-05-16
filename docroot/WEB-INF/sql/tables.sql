create table Q_Answer (
	id_ LONG not null primary key,
	answer VARCHAR(75) null,
	createDate DATE null,
	userId LONG,
	questionId LONG,
	companyId LONG
);

create table Q_Question (
	id_ LONG not null primary key,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	createDate DATE null,
	userId LONG,
	companyId LONG
);