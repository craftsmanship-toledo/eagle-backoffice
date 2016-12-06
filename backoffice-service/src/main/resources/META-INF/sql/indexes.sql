create index IX_B763666 on Eagle_Issue (companyId, groupId);
create index IX_DEBE0DCA on Eagle_Issue (status[$COLUMN_LENGTH:75$]);
create index IX_D1CD2E71 on Eagle_Issue (type_[$COLUMN_LENGTH:75$]);
create index IX_27C003D8 on Eagle_Issue (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_ECA7A05A on Eagle_Issue (uuid_[$COLUMN_LENGTH:75$], groupId);