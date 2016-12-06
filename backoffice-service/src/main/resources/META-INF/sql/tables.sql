create table Eagle_Issue (
	uuid_ VARCHAR(75) null,
	issueId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	type_ VARCHAR(75) null,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	summary VARCHAR(75) null,
	status VARCHAR(75) null,
	votes LONG,
	picture VARCHAR(75) null
);