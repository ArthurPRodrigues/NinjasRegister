-- Migration to add the ranking column to the TB_REGISTER table

ALTER TABLE tb_register
ADD COLUMN rank VARCHAR(255);
