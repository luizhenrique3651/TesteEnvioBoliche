DO $$
BEGIN
	IF NOT EXISTS (
		SELECT FROM pg_catalog.pg_database
		WHERE datname = 'bola_boliche'
	) THEN
		CREATE DATABASE bola_boliche;
	END IF;
END $$;
