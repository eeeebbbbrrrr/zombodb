-- the idea here is that we're doing a SELECT that requires 2 requests through ES' SCAN/SCROLL API
SELECT count(*) FROM events WHERE events ==> range(field=>'id', lte=>20000);